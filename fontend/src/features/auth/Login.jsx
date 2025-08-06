import "../../assets/css/fearuresCss/authCss/login.css"
export default function Login(){

    return(

        <div className="login-container">
            <form action="">
                <h2>Email</h2>
                <input type="email"></input>
                <h2>Password</h2>
                <input type="password"></input>
                <button type="submit">Login</button>
                <button type="submit">Register</button>
            </form>
        </div>
    );
}