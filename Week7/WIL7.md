- POST /hospitals
    ```
    {
        "name": "1111"
    }
    ```
    ![Alt text](images/POST_patients.png)

- GET /hospitals
    ![Alt text](images/GET_hospitals.png)

- GET /hospitals/{name}
    ![Alt text](images/GET_hospitals_1111.png)

- POST /medicalHospitals
    ```
    {
        "name": "1111",
        "hospitalId": 1
    }
    ```
    ![Alt text](images/POST_medicalHospitals.png)

- GET /medicalHospitals
    ![Alt text](images/GET_medicalHospitals.png)

- POST /doctors
    ```
    {
        "name": "doctor"
    }
    ```
    ![Alt text](images/POST_doctors.png)

- GET /doctors
    ![Alt text](images/GET_doctors.png)

- POST /patients
    ```
    {
        "name": "patient"
    }
    ```
    ![Alt text](images/POST_patients.png)

- GET /patients
    ![Alt text](images/GET_patients.png)

- POST /reservations
    ```
    {
        "doctorId": 1,
        "patientId": 1
    }
    ```
    ![Alt text](images/POST_reservations.png)

- GET /reservations
    ![Alt text](images/GET_reservations.png)