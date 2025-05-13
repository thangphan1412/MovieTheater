import '../../assets/adminNavbar.css'
import {useNavigate} from "react-router-dom";
const NavbarAdmin = () => {
    const navigate = useNavigate()
    return(
        <div className="navbar-admin">
            <div className="button-infor">
                <button onClick={() => navigate("/inforUser")}>Thông tin khách hàng</button>
            </div>
            <div className="button-infor">
                <button onClick={() => navigate("/inforEmployees")}>Thông tin nhân viên</button>
            </div>

            <div className="button-infor">
                <button>Tạo nhân viên</button>
            </div>
            <div className="button-infor">
                <button>Thông tin ....</button>
            </div>
        </div>
    )
}
export default NavbarAdmin