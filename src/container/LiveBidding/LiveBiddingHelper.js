import React, { useEffect, useState } from "react";
import { db } from "../../config/Firebase";
import firebase from "firebase";
import BiddingHistory from "./BiddingHistory";
import FlipMove from "react-flip-move";

import { Button, Container, Grid, Typography } from "@material-ui/core";
import "../../assets/css/liveBidding.css";
import { makeStyles } from "@material-ui/core";
import theme from "../../assets/js/DarkTheme";
import "../../assets/css/liveBidding.css";

const useStyles = makeStyles((theme) => ({
  heading: {
    color: 'goldenrod'
  },

  leftGrid: {
    padding: "20px",
  },
  
 
  bidButton: {
    border: "2px solid black",
    padding: "5px 20px",
    borderRadius: "5px",
    margin: "10px 0 30px 0",
  },

}));

const LiveBiddingHelper = ({ player, playerId, teamId }) => {
  const classes = useStyles();

  const [biddingValue, setbiddingValue] = useState(parseInt(player.maxbid));
  const [bidDisplay, setbidDisplay] = useState([]);
  const [balance, setBalance] = useState(0);

  //console.log(teamId);

  const sendBid = (e) => {
    e.preventDefault();

    db.collection("players").doc(playerId).collection("Bids").add({
      teamId: teamId,
      biddingprice: biddingValue,
      timestamp: firebase.firestore.FieldValue.serverTimestamp(),
    });

    //console.log("Maxbid:", player.maxbid);
    //console.log("Price:", biddingValue);
    if (
      parseInt(player.maxbid) < parseInt(biddingValue) ||
      parseInt(player.maxbid) === parseInt(player.baseprice)
    ) {
      db.collection("players").doc(playerId).update({
        maxbid: biddingValue,
        maxbidBy: teamId,
      });
    }
    //const ref2 = db.collection("players").doc(playerId);
    if (parseInt(biddingValue) < 200 && parseInt(biddingValue) >= 20)
      setbiddingValue(parseInt(biddingValue) + 10);
    else if (parseInt(biddingValue) < 500 && parseInt(biddingValue) >= 200) {
      setbiddingValue(parseInt(biddingValue) + 20);
    } else {
      setbiddingValue(parseInt(biddingValue) + 25);
    }
  };

  // console.log("ID:", playerId);
  useEffect(() => {
    ///setting bidding value
    db.collection("players")
      .where("display", "==", "true")
      .where("category", "==", "live")
      .onSnapshot({ includeMetadataChanges: true }, (snapshot) => {
        snapshot.docs.map((doc) => {
          // console.log(doc.id, "=>", doc.data());

          if (
            parseInt(doc.data().baseprice) === parseInt(doc.data().maxbid) &&
            player.maxbidBy === ""
          ) {
            console.log("equal");
            // setbiddingValue(parseInt(doc.data().baseprice));
          } else if (
            parseInt(doc.data().baseprice) === parseInt(doc.data().maxbid) &&
            player.maxbidBy !== ""
          ) {
            if (
              parseInt(doc.data().maxbid) < 500 &&
              parseInt(doc.data().maxbid) >= 200
            ) {
              setbiddingValue(parseInt(doc.data().maxbid) + 20);
            }
          } else {
            if (
              parseInt(doc.data().maxbid) < 500 &&
              parseInt(doc.data().maxbid) >= 200
            ) {
              setbiddingValue(parseInt(doc.data().maxbid) + 20);
            } else {
              setbiddingValue(parseInt(doc.data().maxbid) + 25);
            }
          }
        });
      });

    /*  if (parseInt(player.baseprice) === parseInt(player.maxbid)) {
      setbiddingValue(parseInt(player.baseprice));
    } else {
      if (parseInt(player.maxbid) < 200 && parseInt(player.maxbid) >= 20)
        setbiddingValue(parseInt(player.maxbid) + 10);
      else if (
        parseInt(player.maxbid) < 500 &&
        parseInt(player.maxbid) >= 200
      ) {
        setbiddingValue(parseInt(player.maxbid) + 20);
      } else {
        setbiddingValue(parseInt(player.maxbid) + 25);
      }
    }*/
  }, [player.maxbidBy]);
  useEffect(() => {
    db.collection("users")
      .doc(teamId)
      .onSnapshot((snapshot) => {
        if (snapshot.exists) {
          setBalance(parseInt(snapshot.data().teamBalance));
        }
      });
  }, []);
  useEffect(() => {
    //fetch bids from database
    db.collection("players")
      .doc(playerId)
      .collection("Bids")
      .orderBy("timestamp", "desc")
      .limit(10)
      .onSnapshot((snapshot) => {
        setbidDisplay(
          snapshot.docs.map((doc) => ({ id: doc.id, data: doc.data() }))
        );
      });
  }, [player.maxbid]);

  //console.log(bidDisplay);
  // console.log(biddingValue);
  //console.log(Display);
  //useEffect(() => {}, [Status]);

  return (
    <Container style={{ marginTop: "50px", width: "100%" }}>
        <Typography
          variant="h3"
          className={classes.heading}
          color="primary"
          align="center"
        >
          LIVE AUCTION
        </Typography>

      <Grid container justify="center" spacing={3}>
        <Grid item xs={11} sm={10} md={6} lg={6} display="inline">
          <div className={classes.leftGrid}>
            <div className="leftGridStyle">
              <div className="leftGridBack"></div>

              <div className="leftGridTop">
                <Typography
                  variant="h2"
                  align="center"
                  color="primary"
                  style={{
                    fontWeight: "bold",
                    fontSize: "3em",
                    textTransform: "uppercase",
                    marginTop: "10px",
                  }}
                  className="playername"
                >
                  {player.name}({player.age})
                </Typography>

                <div style={{ marginTop: "30px", display: "flex", flexDirection: "row", justifyContent: "space-around"}}>
                  <img src={player.Image} className="playerCard" alt="No Image" 
                    style={{
                      // margin: '0 auto'
                      // marginLeft: '-10%',
                      borderRadius: "10px",
                    }}
                  ></img>

                  <div
                    style={{ display: "block", justifyContent: "space-around" }}
                    className={classes.playerDetailsWrapper}
                  >
                    {/* <Grid item xs={3}> */}
                    <div>
                      <Typography className='playerDetails' variant='h6' style={{fontWeight: '600', color: 'goldenrod'}}>
                        Runs: {player.Runs}
                      </Typography>
                      <Typography className='playerDetails' variant='h6' style={{fontWeight: '600', color: 'goldenrod'}}>
                        Batting Average: {player.Batavg}
                      </Typography>
                      <Typography  className='playerDetails' variant='h6' style={{fontWeight: '600', color: 'goldenrod'}}>
                        Strike Rate: {player.strikerate}
                      </Typography>
                    </div>

                    {/* </Grid> */}
                    {/* <Grid item xs={3}> */}

                    <div>
                      <Typography className='playerDetails' variant='h6' style={{fontWeight: '600', color: 'goldenrod'}}>
                        Wickets: {player.wickets}
                      </Typography>
                      <Typography  className='playerDetails' variant='h6' style={{fontWeight: '600', color: 'goldenrod'}}>
                        Economy: {player.economy}
                      </Typography>
                      <Typography  className='playerDetails' variant='h6' style={{fontWeight: '600', color: 'goldenrod'}}>
                        Bowling Average: {player.Bowlavg}
                      </Typography>
                    </div>
                  </div>
                </div>

                <div className='bidSection'>
                  <div className="bidButtonStyle">
                    <Typography color="primary" variant="h4"  style={{fontWeight: '600', color: 'goldenrod'}}>
                      {" "}
                      Base Price: {player.baseprice} Lakhs{" "}
                    </Typography>
                    {/* {player.maxbidBy === teamId ? <h3>WINNING</h3> : console.log("False")} */}
                    <form>
                      {balance >= biddingValue ? (
                        [
                          player.maxbidBy !== teamId ? (
                            <button
                              type="submit"
                              onClick={sendBid}
                              className={classes.bidButton}
                              style={{ backgroundColor: "#3160fd" }}
                            >
                              <Typography variant="h6" color="primary">
                                {biddingValue}L Bid{" "}
                              </Typography>
                            </button>
                          ) : (
                            <button
                              type="submit"
                              disabled
                              className={classes.bidButton}
                              style={{ backgroundColor: "#555" }}
                            >
                              <Typography
                                variant="h6"
                                style={{ color: "#fff" }}
                              >
                                {biddingValue}L Bid{" "}
                              </Typography>
                            </button>
                          ),
                        ]
                      ) : (
                        <button disabled>
                          <p>Not Enough Balance</p>
                        </button>
                      )}
                    </form>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </Grid>

        <Grid item xs={11} sm={10} md={6} lg={6}>
          <div className="rightGridStyle">
            <div className="rightGridBack"></div>
            <div className="rightGridTop">
              <Container
                className={classes.rightGrid}
                style={{ marginTop: "10px", padding: "30px 0 50px 30px" }}
              >
                <Typography variant="h3" color='primary' align='center'                 
                    style={{
                    fontWeight: "bold",
                    fontSize: "2em",
                    textTransform: "uppercase",
                    // marginTop: "10px",
                    marginBottom: '10px'
                  }}>
                    Bidding History</Typography>
                <FlipMove>
                  {bidDisplay ? (
                    bidDisplay.map((bid) => {
                      return <BiddingHistory key={bid.id} bid={bid.data} />;
                    })
                  ) : (
                    <Typography variant="h3" color='primary'>No Bids</Typography>
                  )}
                </FlipMove>
              </Container>
            </div>
          </div>
        </Grid>
      </Grid>
    </Container>
  );
};

export default LiveBiddingHelper;

/*  useEffect(() => {
    db.collection("players")
      .where("category", "==", "live")
      .where("status", "==", "close")
      .onSnapshot((snapshot)=>{
        if(snapshot.exists){
          snapshot.doc.for
        }
      })



    if (player.status === "close") {
      db.collection("players").doc(player.name).update({
        team: player.maxbidBy,
      });
      const ref3 = db.collection("users").doc(player.maxbidBy);

      ref3.onSnapshot((snapshot) => {
        if (snapshot.exists) {
          ref3.update({
            teamBalance:
              parseInt(snapshot.data().teamBalance) - parseInt(player.maxbid),
          });
        }
      });
    }
  }, [player.status]); */
