package jay.library_system;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {


    @GetMapping("/dashboard")
    public String getDashboard(Model model) {
        model.addAttribute("activePage", "dashboard");
        return "views/backend/dashboard/index";
    }

    /*MEMBERSHIP*/
    @GetMapping("/membership")
    public String getMembership(Model model) {
        model.addAttribute("activePage", "membership");
        return "views/backend/membership/index";
    }

    @GetMapping("/create-membership")
    public String getCreateMembership(Model model) {
        model.addAttribute("activePage", "membership");
        return "views/backend/membership/create";
    }

    @GetMapping("/update-membership")
    public String getUpdateMembership(Model model) {
        model.addAttribute("activePage", "membership");
        return "views/backend/membership/update";
    }

    /*PUBLISHER*/
    @GetMapping("/publisher")
    public String getPublisher(Model model) {
        model.addAttribute("activePage", "publisher");
        return "views/backend/publisher/index";
    }

    @GetMapping("/create-publisher")
    public String getCreatePublisher(Model model) {
        model.addAttribute("activePage", "publisher");
        return "views/backend/publisher/create";
    }

    @GetMapping("/update-publisher")
    public String getUpdatePublisher(Model model) {
        model.addAttribute("activePage", "publisher");
        return "views/backend/publisher/update";
    }

    /*BOOKS*/
    @GetMapping("/books")
    public String getBook(Model model) {
        model.addAttribute("activePage", "books");
        return "views/backend/books/index";
    }

    @GetMapping("/create-books")
    public String getCreateBook(Model model) {
        model.addAttribute("activePage", "books");
        return "views/backend/books/create";
    }

    @GetMapping("/update-books")
    public String getUpdateBook(Model model) {
        model.addAttribute("activePage", "books");
        return "views/backend/books/update";
    }

    /*CATEGORIES*/
    @GetMapping("/categories")
    public String getCategories(Model model) {
        model.addAttribute("activePage", "categories");
        return "views/backend/categories/index";
    }

    @GetMapping("/create-categories")
    public String getCreateCategories(Model model) {
        model.addAttribute("activePage", "categories");
        return "views/backend/categories/create";
    }

    @GetMapping("/update-categories")
    public String getUpdateCategories(Model model) {
        model.addAttribute("activePage", "categories");
        return "views/backend/categories/update";
    }

    /*AUTHOR*/
    @GetMapping("/author")
    public String getAuthor(Model model) {
        model.addAttribute("activePage", "authors");
        return "views/backend/author/index";
    }

    @GetMapping("/create-author")
    public String getCreateAuthor(Model model) {
        model.addAttribute("activePage", "authors");
        return "views/backend/author/create";
    }

    @GetMapping("/update-author")
    public String getUpdateAuthor(Model model) {
        model.addAttribute("activePage", "authors");
        return "views/backend/author/update";
    }

    /*RESERVATION*/
    @GetMapping("/reservations")
    public String getReservation(Model model) {
        model.addAttribute("activePage", "reservation");
        return "views/backend/reservation/index";
    }

    @GetMapping("/create-reservation")
    public String getCreateReservation(Model model) {
        model.addAttribute("activePage", "reservation");
        return "views/backend/reservation/create";
    }

    @GetMapping("/update-reservation")
    public String getUpdateReservation(Model model) {
        model.addAttribute("activePage", "reservation");
        return "views/backend/reservation/update";
    }

    /*STAFF*/
    @GetMapping("/staff")
    public String getStaff(Model model) {
        model.addAttribute("activePage", "staff");
        return "views/backend/staff/index";
    }

    @GetMapping("/create-staff")
    public String getCreateStaff(Model model) {
        model.addAttribute("activePage", "staff");
        return "views/backend/staff/create";
    }

    @GetMapping("/update-staff")
    public String getUpdateStaff(Model model) {
        model.addAttribute("activePage", "staff");
        return "views/backend/staff/update";
    }

    /*FINES*/
    @GetMapping("/fines")
    public String getFines(Model model) {
        model.addAttribute("activePage", "fines");
        return "views/backend/fines/index";
    }

    @GetMapping("/create-fines")
    public String getCreateFines(Model model) {
        model.addAttribute("activePage", "fines");
        return "views/backend/fines/create";
    }

    @GetMapping("/update-fines")
    public String getUpdateFines(Model model) {
        model.addAttribute("activePage", "fines");
        return "views/backend/fines/update";
    }

    /*LOANS*/
    @GetMapping("/loans")
    public String getLoans(Model model) {
        model.addAttribute("activePage", "loans");
        return "views/backend/loans/index";
    }

    @GetMapping("/create-loans")
    public String getCreateLoans(Model model) {
        model.addAttribute("activePage", "loans");
        return "views/backend/loans/create";
    }

    @GetMapping("/update-loans")
    public String getUpdateLoans(Model model) {
        model.addAttribute("activePage", "loans");
        return "views/backend/loans/update";
    }

    /*LIBRARY BRANCHES*/
    @GetMapping("/library-branches")
    public String getLibraryBranches(Model model) {
        model.addAttribute("activePage", "library-branch");
        return "views/backend/library-branches/index";
    }

    @GetMapping("/create-library-branches")
    public String getCreateLibraryBranches(Model model) {
        model.addAttribute("activePage", "library-branch");
        return "views/backend/library-branches/create";
    }

    @GetMapping("/update-library-branches")
    public String getUpdateLibraryBranches(Model model) {
        model.addAttribute("activePage", "library-branch");
        return "views/backend/library-branches/update";
    }

    /*AUTH LOGIN*/
    @GetMapping("/auth-login")
    public String getAuthLogin(Model model) {
        model.addAttribute("activePage", "auth-login");
        return "views/frontend/auth-login/index";
    }

    @GetMapping("auth-forgot-password")
    public String getAuthForgotPassword(Model model) {
        model.addAttribute("activePage", "auth-forgot-password");
        return "views/frontend/auth-forgot-password/index";
    }

    @GetMapping("/auth-register")
    public String getAuthRegister(Model model) {
        model.addAttribute("activePage", "auth-register");
        return "views/frontend/auth-register/index";
    }
}
