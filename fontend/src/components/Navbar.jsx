import '../assets/navbar.css';
import { Link } from 'react-router-dom';

function Navbar() {
    return (
        <div className="navbar_main">
            <ul>
                <li><Link to="/login">Sign in</Link></li>
                <li><Link to="/register">Register</Link></li>
            </ul>
        </div>
    );
}

export default Navbar;
