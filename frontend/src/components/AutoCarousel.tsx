import Carousel from "react-bootstrap/Carousel";
import dummy_image from "../images/dummy-picture.png";

export function AutoCarousel() {
  return (
    <Carousel>
      <Carousel.Item>
        <img src={dummy_image} className="d-block w-75 h-25 mx-auto" alt="" />
        <Carousel.Caption>
          <h3>First slide label</h3>
          <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
        </Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item>
        <img src={dummy_image} className="d-block w-75 mx-auto" alt="" />
        <Carousel.Caption>
          <h3>Second slide label</h3>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
        </Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item>
        <img src={dummy_image} className="d-block w-75 mx-auto" alt="" />
        <Carousel.Caption>
          <h3>Third slide label</h3>
          <p>
            Praesent commodo cursus magna, vel scelerisque nisl consectetur.
          </p>
        </Carousel.Caption>
      </Carousel.Item>
    </Carousel>
  );
}
