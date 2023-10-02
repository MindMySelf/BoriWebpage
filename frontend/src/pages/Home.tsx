import { Col, Container, Row } from "react-bootstrap";

export function Home() {
  return (
    <>
        <h1 className="main_title">Welcome to Page Maker!</h1>
        <div className="quote-container">
          "Everyone needs to start somewhere. <br /> We want to make it simple."
        </div>
      <Container>
        <h2>What can you achieve with our service?</h2>
        <Row>
          <Col>
            <h3>Create your own webpage!</h3>
            <p className="bg-warning rounded p-4">
              You can create your dream home page in minutes using our service!
              Are you starting your carrier and want to have a webpage for it?{" "}
              <br />
              No need to wait long or pay big, we can assist you to get you
              started <strong>fast</strong> and <strong>easy</strong>! <br />
              You can create and even update your page to our website, no need
              to deal with databases or whatnot, we got you covered every step
              on the road!
            </p>
          </Col>
          <Col>
            <h3>View others pages!</h3>
            <p className="bg-warning rounded p-4">
              You are in need of a professional help? Do you tired of Google
              adds and the not-so-reliable webpages of private professionals?{" "}
              <br /> We can help because our website offer many different
              webpages to browse in with different kind of profiles which you
              can easily search in and find the best person for the job you
              need!
            </p>
          </Col>
        </Row>
      </Container>
    </>
  );
}
