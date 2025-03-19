import { useState } from "react";

function Increment(){
    const [count,setCount]=useState(0)
    return(
        <div>
            <Header/>
            <h2>Count is {count}</h2>
            <button onClick={()=>setCount(count+1)}>Increment</button>
            <button onClick={()=>setCount(count-1)}>Increment</button>
            <Footer/>
        </div>
    )
}
export  default Increment
const Header=()=><h1>Counter</h1>
const Footer=function(){
    return(
        <div><h3>Footer</h3></div>
    )
}

