import React from "react";
class Foo extends React.Component{
    constructor(props){
        super(props)
       this.state={
            color:"black",
            city:"Gotham"
        }
    }
    render(){
        return(
            <div>
                <h2>Color:{this.state.color}</h2>
                <h3>City:{this.state.city}</h3>
                <h3>Year:{this.props.year}</h3>
            </div>
        );
    }
}
export default Foo;