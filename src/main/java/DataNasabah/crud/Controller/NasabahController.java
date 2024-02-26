package DataNasabah.crud.Controller;

import DataNasabah.crud.Entity.Nasabah;
import DataNasabah.crud.Repository.NasabahRepo;
import DataNasabah.crud.service.NasabahService;
import lombok.Getter;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/V1")
public class NasabahController {
    private final NasabahService nasabahservice;

    public NasabahController(NasabahService nasabahservice) {
        this.nasabahservice = nasabahservice;
    }

    @PostMapping("/register")
    public ResponseEntity RegisterController (@RequestBody Nasabah nasabah){
        return new ResponseEntity(nasabahservice.register(nasabah), HttpStatusCode.valueOf(200));
    }

    @GetMapping("/Find/")
    public ResponseEntity FindContoller(@RequestBody Nasabah nasabah){
        return new ResponseEntity(nasabahservice.findNasabah(nasabah.getNomorKtp()), HttpStatusCode.valueOf(200));
    }
    @GetMapping("/view")
    public  ResponseEntity ViewController(){
        return new ResponseEntity(nasabahservice.view(), HttpStatusCode.valueOf(200));
    }
    @PutMapping("/update")
    public  ResponseEntity UpdateController(@RequestBody Nasabah nasabah){
        return new ResponseEntity(nasabahservice.update(nasabah), HttpStatusCode.valueOf(200));
    }
    @DeleteMapping("/delete/{noktp}")
    public  ResponseEntity deleteController(@PathVariable String noktp){
        return new ResponseEntity(nasabahservice.delete(noktp), HttpStatusCode.valueOf(200));
    }

}
