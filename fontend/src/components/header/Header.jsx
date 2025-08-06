import PeHeader from "./PreHeader";
import ContentHeader from "./ContentHeader";
import HeaderContent2 from "./HeaderContent2";

export default function Header() {
    return(
        <div className="header-container">
            <PeHeader/>
            <HeaderContent2/>
            <ContentHeader/>
        </div>
    );
}