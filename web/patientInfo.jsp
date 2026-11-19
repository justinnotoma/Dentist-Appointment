<!--
Class: CIST 2373 Java Programming III
Term: Fall 2026
Instructor: Ronald Enz
Description: HTML page for final project
Author: Justin Notoma

By turning in this code, I Pledge:
    1. That I have completed the programming assignment independently
    2. I have not copied the code from a student or any source
    3. I have not given my code to any student
-->

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dentist Appointment - Your Info</title>
    <link rel="stylesheet" href="./styles/patientInfo.css">
</head>
<body>
    <header class="welcome-header">
        <h1>Welcome, Jimmy</h1>
        <a href="./index.html"> Logout <img src="./assets/icons/logoutIcon.svg" alt="Logout icon"> </a>
    </header>

    <main>
        <!-- Patient Appointment Information -->
        <header>
            <h2>Appointment Information</h2>
            <h3>May</h3>
        </header>

        <!-- Date containers -->
        <section>
            <div class="date-container">
                <div class="date">
                    <p>Mon</p>
                    <p>29</p>
                </div>
            </div>
            <div class="date-container">
                <div class="date">
                    <p>Tues</p>
                    <p>30</p>
                </div>
            </div>
            <div class="date-container">
                <div class="date">
                    <p>Wed</p>
                    <p>1</p>
                </div>

                <div class="info">
                    <p>Cavity</p>
                    <p>Fill a cavity</p>

                    <p>$319.00</p>
                    <p>9:00 AM</p>
                    
                </div>
            </div>
            <div class="date-container">
                <div class="date">
                    <p>Thur</p>
                    <p>2</p>
                </div>
            </div>
            <div class="date-container">
                <div class="date">
                    <p>Fri</p>
                    <p>3</p>
                </div>
            </div>
            <div class="date-container">
                <div class="date">
                    <p>Sat</p>
                    <p>4</p>
                </div>
            </div>
            <div class="date-container">
                <div class="date">
                    <p>Sun</p>
                    <p>5</p>
                </div>
            </div>
        </section>
    </main>

    <aside>
        <h2>Account Info</h2>
        <!-- Patient account Info -->
        <table>
            <thead>
                <tr>
                    <th>Label</th>
                    <th>Data</th>
                </tr>
            </thead>

            <tbody>
                <tr>
                    <td>ID</td>
                    <td>A900</td>
                </tr>

                <tr>
                    <td>Password</td>
                    <td>1234</td>
                </tr>
                <tr>
                    <td>First Name</td>
                    <td>Jimmy</td>
                </tr>
                <tr>
                    <td>Last Name</td>
                    <td>Hawkins</td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td>Marietta</td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td>jhawk@yahoo.com</td>
                </tr>
                <tr>
                    <td>Insurance Company</td>
                    <td>Cigna</td>
                </tr>
            </tbody>
            
        </table>
    </aside>
</body>
</html>