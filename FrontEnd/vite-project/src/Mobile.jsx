import React from "react";

class Mobile extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      mobileDetails: {
        id: 1,
        model: "Nokia",
        price: 99999
      }
    };
  }

  render() {
    return (
      <div>
        <h1>Mobile Specifications</h1>
        <MobileDetails 
          id={this.state.mobileDetails.id}
          model={this.state.mobileDetails.model}
          price={this.state.mobileDetails.price}
        />
      </div>
    );
  }
}


class MobileDetails extends React.Component {
  render() {
    return (
      <div className="mobile-info">
        <h2>Mobile Details</h2>
        <p>ID: {this.props.id}</p>
        <p>Model: {this.props.model}</p>
        <p>Price: ₹{this.props.price}</p>
      </div>
    );
  }
}

export default Mobile;