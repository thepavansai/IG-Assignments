


import { Link } from 'react-router'
import Login from '../../FrontEnd/vite-project/src/task 2/Login'
import Signup from '../../FrontEnd/vite-project/src/task 2/Signup'

function Home() {


  return (
    <>
    <h1>Home</h1>
    <ul>
      <li>
        <Link to="/">Home</Link>
      </li>
      <li>
        <Link to="login">Login</Link>
      </li>
      <li>
        <Link to="signup">Sign Up</Link>
      </li>
    </ul>
    </>
   
   

  )
}

export default Home
