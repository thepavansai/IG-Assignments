import { useState } from "react"
const intialList=['hi','hello','world']
function MapRelated() {
    const [value,setValue] = useState('')
    const [list,setList]=useState(intialList)

    const handleChange= event =>{setValue(event.target.value)}
    const handleSubmit=event=>{
        setList(intialList.concat(value))
        event.prevent.Default()
    }
    return(
        <div>
            <h7>Enter a value</h7><br></br>
            <input type="text" onChange={handleChange} />
            <br></br>
            {value}
            <br></br>
            <button onClick={handleSubmit}>Submit</button>
            <br></br>
            {list}
        </div>
    )
}
export default MapRelated
