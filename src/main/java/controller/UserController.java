package controller;

import entity.User;
import lombok.AllArgsConstructor;
import service.iUserService;

import java.util.List;

@AllArgsConstructor
public class UserController implements iUserService {

    private iUserService service;

    /**
     * @return Danh sách user trong database
     * */

    public List<User> findAll()  {
        return service.findAll();
    }


    /**
     * @param id khoa chin
     * @return thong tin user
     */
    public User findById(int id) {
        return service.findById(id);
    }


    /**
     * @param email tai khoan
     * @param password mat khaiu
     * @return dang nhap thanh cong hoac tra ve null neu that bai
     */
    public User findByEmailAndByPassWord(String email, String password) {
        return service.findByEmailAndByPassWord(email, password);
    }


    /**
     * Cach dung:
     * <pre>{@code
     * controller.Create ("Bui QUang Duc", "bqd11@gmail.com")
     * }
     * @param fullName Ho va ten
     * @param email dia chi lien lac
     * @return
     */
    public int Create(String fullName, String email){
        return service.Create(fullName,email);
    }


    public int deleteById(int id) {
        return service.deleteById(id);
    }
}
