package gym.demo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import sun.management.counter.Units;

import java.util.List;
@Component

public class RestTesting implements CommandLineRunner{

    @Override

    public void run(String...args)throws Exception {
        RestTemplate restTemplate = new RestTemplate();




        Student newtudent = new Student("Elphas", 1234, 1);
        Student createdStudent = restTemplate.postForObject(" http://10.51.10.111:1000/Student\n", newtudent, Student.class);
        System.out.println(createdStudent.toString());

        ResponseEntity<List<Unit>> respons = restTemplate.exchange("http://10.51.10.111:1000/units\n",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Unit>>() {
                });
        {


        }
        List<Unit> units=respons.getBody();
        for (Unit unit : units) {
            System.out.println(unit.toString());
        }
        String creatUnitURL="http://10.51.10.111:1000/{unitId}/enroll/{studentId}\n"+createdStudent.getId()+"/units";
        Unit newunit= new Unit(1, "Programming");
        Unit createdUnit = restTemplate.postForObject(creatUnitURL,newunit,Unit.class);
        System.out.println(createdUnit.toString());



    }}i