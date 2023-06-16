<?php
class AuthenticationHandler {

    public mysqli $conn;

    function authenticate() {
        $user = $_POST['user'];
        $pass = $_POST['pass'];
        $authenticated = false;

        $query = "SELECT * FROM users WHERE user = '" . $user . "' AND pass = '" . $pass . "'";

        $stmt = $this->conn->query($query); // Noncompliant

        if ($stmt->num_rows == 1) {
          $authenticated = true;
        }

        return $authenticated;
    }
}
