package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.function.DoublePredicate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import model.ConnectBD;
import model.Produit;
import model.produitDAOImp;


@Controller
public class ProductController {
@RequestMapping("/AJOUTER")
public String Affichage() {
	return "AJOUTER";
}


@RequestMapping("/ADD*")
public String AjouterProduit(@RequestParam(name = "nomProduit") String nomProduit,
		@RequestParam(name = "prixProduit") String prixProduit
		,@RequestParam(name = "idFournisseur") String idFournisseur, Model model) {
	produitDAOImp dao = new produitDAOImp();
	Produit produit = dao.create(new Produit(Integer.parseInt(idProduit), nomProduit, Double.parseDouble(prixProduit), Integer.parseInt(idFournisseur)));
	return "ADD";
}

}
