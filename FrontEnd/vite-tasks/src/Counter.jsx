// import { useState } from "react"
import React from "react"
class  Counter extends React.Component{
    constructor(props){
        super(props);
        this.state={
            count:0
        }
    }
    Increment=  () => this.setState((c)=>({count:c.count+1}))

    Decrement= () => this.setState((c)=>({count:c.count-1}))
    render(){
        return (
            <div className="card">
                <h3>count is {this.state.count}</h3>
            <button onClick={this.Increment}>
              Increment
            </button>
            <button onClick={this.Decrement}>
              Decrement
            </button>
          </div>
        )
    }

}
export default Counter