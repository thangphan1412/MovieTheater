import '../../assets/tableInfor.css'
import {useNavigate} from "react-router-dom";
const InforEmployees = () => {
    const navigate = useNavigate();
    return (
      <div className="infor-wrapper">
          <div className="infor-main">
              <div className="search-infor">
                <button>search</button>
              </div>
              <div className="table-wrapper">
                  <table>
                      <tr>
                          <th>ID</th>
                          <th>User name</th>
                          <th>Họ và tên</th>
                          <th>Email</th>
                          <th>Số điện thoại</th>
                          <th></th>
                      </tr>
                      <tr>
                          <th>Dòng 2</th>
                          <th>Dòng 2</th>
                          <th>Dòng 2</th>
                          <th>Dòng 2</th>
                          <th>Dòng 2</th>
                          <button>chi tiết</button>
                      </tr>
                      <tr>
                          <th>Dòng 2</th>
                          <th>Dòng 2</th>
                          <th>Dòng 2</th>
                          <th>Dòng 2</th>
                          <th>Dòng 2</th>
                          <button>chi tiết</button>
                      </tr>
                      <tr>
                          <th>Dòng 2</th>
                          <th>Dòng 2</th>
                          <th>Dòng 2</th>
                          <th>Dòng 2</th>
                          <th>Dòng 2</th>
                          <button>chi tiết</button>
                      </tr>
                  </table>
              </div>
          </div>
      </div>
  )
}
export default InforEmployees