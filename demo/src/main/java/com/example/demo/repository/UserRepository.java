package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Usuario;

@Repository
public class UserRepository {
    public void save(Usuario usuario){
        if(usuario.getId() == null){
            System.out.println("SAVE");
        }else{
            System.out.println("UPDATE");
        };

        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.println("Recebendo id para deletar usuario");
        System.out.println(id);
    }

    public Usuario findById(Integer id){
        System.out.println("recebendo id para localizar usuario");
        return new Usuario("matheus", "password");
    }
    public Usuario findByUserName(String userName){
        System.out.println("rebendo name para achar usuario");
        return new Usuario(userName, "password");
    }

    public List<Usuario> findAll(){
        System.out.println("Listando usuarios");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("matheus","password"));
        return usuarios;
    }
}
