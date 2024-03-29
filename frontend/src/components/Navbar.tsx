import { Button, Container, Nav, Navbar as NavbarAs } from "react-bootstrap";
import { NavLink } from "react-router-dom";

export function Navbar() {
  return (
    <NavbarAs className="bg-white" sticky="top">
      <Container>
        <Nav className="me-auto">
          <Nav.Link to={"/"} as={NavLink}>
            Home
          </Nav.Link>
          <Nav.Link to={"/pages"} as={NavLink}>
            Pages
          </Nav.Link>
          <Nav.Link to={"/templates"} as={NavLink}>
            Templates
          </Nav.Link>
        </Nav>
        <div className="dropdown mt-3">
          <Button
            type="button"
            className="btn btn-secondary dropdown-toggle"
            data-bs-toggle="dropdown"
            aria-expanded="false"
            variant="info"
          >
            <svg
              xmlns="http://www.w3.org/2000/svg"
              width="24"
              height="24"
              viewBox="0 0 24 24"
              id="profile"
            >
              <g fill="#200E32" transform="translate(3 2)">
                <ellipse
                  cx="9"
                  cy="5.556"
                  opacity=".4"
                  rx="5.625"
                  ry="5.556"
                ></ellipse>
                <path d="M17.9902354,16.6757991 L17.9902354,16.6757991 C17.9953097,16.5967226 17.9953097,16.5174327 17.9902354,16.4383562 C17.9679741,16.1461262 17.885058,15.8607505 17.7461199,15.5981735 C17.1993012,14.5296804 15.6662559,14.0456621 14.3870907,13.7716895 C13.4744565,13.5817014 12.5471782,13.4595545 11.6139387,13.4063927 L10.6374767,13.3333333 L10.1980688,13.3333333 L9.6512501,13.3333333 L8.34279105,13.3333333 L7.79597234,13.3333333 L7.35656445,13.3333333 L6.38010248,13.4063927 C5.44686291,13.4595545 4.51958466,13.5817014 3.60695046,13.7716895 C2.32778527,14.0091324 0.794739971,14.5022831 0.247921264,15.5981735 C0.10898315,15.8607505 0.0260670984,16.1461262 0.00380576968,16.4383562 C-0.00126858989,16.5174327 -0.00126858989,16.5967226 0.00380576968,16.6757991 L0.00380576968,16.6757991 C-0.000879294659,16.7548861 -0.000879294659,16.834155 0.00380576968,16.913242 C0.0303656032,17.2029741 0.116574533,17.4851701 0.257685884,17.7442922 C0.804504591,18.8127854 2.33754989,19.2968037 3.61671508,19.5707763 C4.53104892,19.7518719 5.45762024,19.8739256 6.3898671,19.9360731 L7.36632907,20 L7.60067995,20 L7.80573696,20 L10.2078334,20 L10.4128904,20 L10.6472413,20 L11.6237033,19.9360731 C12.5559501,19.8739256 13.4825215,19.7518719 14.3968553,19.5707763 C15.6760205,19.3242009 17.2090658,18.8401826 17.7558845,17.7442922 C17.890425,17.4769528 17.9730826,17.1893744 18,16.8949772 C18.0012406,16.8218031 17.9979804,16.748623 17.9902354,16.6757991 Z"></path>
              </g>
            </svg>
            Profile
          </Button>
          <ul className="dropdown-menu">
            <li>
              <a className="dropdown-item" href="/client">
                Profile
              </a>
            </li>
            <li>
              <a className="dropdown-item" href="/history">
                History
              </a>
            </li>
            <li>
              <a className="dropdown-item" href="/clientpages">
                Pages
              </a>
            </li>
            <li>
              <hr className="dropdown-divider" />
            </li>
            <li>
              <a className="dropdown-item" href="/logout">
                {/* <svg
                  xmlns="http://www.w3.org/2000/svg"
                  viewBox="0 0 24 24"
                  id="logout"
                >
                  <path d="M4,12a1,1,0,0,0,1,1h7.59l-2.3,2.29a1,1,0,0,0,0,1.42,1,1,0,0,0,1.42,0l4-4a1,1,0,0,0,.21-.33,1,1,0,0,0,0-.76,1,1,0,0,0-.21-.33l-4-4a1,1,0,1,0-1.42,1.42L12.59,11H5A1,1,0,0,0,4,12ZM17,2H7A3,3,0,0,0,4,5V8A1,1,0,0,0,6,8V5A1,1,0,0,1,7,4H17a1,1,0,0,1,1,1V19a1,1,0,0,1-1,1H7a1,1,0,0,1-1-1V16a1,1,0,0,0-2,0v3a3,3,0,0,0,3,3H17a3,3,0,0,0,3-3V5A3,3,0,0,0,17,2Z"></path>
                </svg> */}
                Log out
              </a>
            </li>
          </ul>
        </div>
      </Container>
    </NavbarAs>
  );
}
