import axios from 'axios'
import { useEffect, useState } from 'react'
import "@fontsource/goudy-bookletter-1911";

function Axiosapi(){
    const[users,setUsers]=useState()
    const[loading,setLoading]=useState(true)
    const[error,setError]=useState()
    useEffect(()=>{
        axios.get('https://jsonplaceholder.typicode.com/users')
        .then((response)=>{
            setUsers(response.data)
            
            setLoading(false)
        })
        .catch((error)=>{
            setError("Unable to get data")
            setLoading(false)
        })}
    ,[])
    if (loading) return <h2>Loading</h2>
    if (error) return<h2 style={{color:'red'}}>{error}</h2>
    console.log(users)
    return(
        <>
        <div style={{fontFamily:"Goudy Bookletter 1911"}}>
            <h1>User's List</h1>
            <ul>
                {users.map((user)=>(
                    <li key={user.id} style={{ margin:'10px', display: 'flex', justifyContent: 'space-between' }}>
                    <span>{user.name}</span>
                    <span>{user.email}</span>
                    <span>{user.phone}</span>
                </li>
                ))}
            </ul>
        </div>
        </>
    )
}
export default Axiosapi