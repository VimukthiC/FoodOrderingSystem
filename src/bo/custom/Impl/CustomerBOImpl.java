
package bo.custom.Impl;

import bo.custom.CustomerBO;
import dao.DAOFactory;
import dao.custom.CustomerDAO;
import dto.CustomerDTO;
import entity.Customer;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBOImpl implements CustomerBO{
     CustomerDAO dao = (CustomerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);

    @Override
    public boolean addCustomer(CustomerDTO dto) throws ClassNotFoundException, SQLException {
        return dao.add(new Customer(dto.getCustomerID(), dto.getCustomerName(), dto.getCustomerAddress(),dto.getCustomerPhone(),dto.getCustomerNIC(), dto.getCustomerSalary()));
    }

    @Override
    public boolean updateCustomer(CustomerDTO dto) throws ClassNotFoundException, SQLException {

        return dao.update(new Customer(dto.getCustomerID(), dto.getCustomerName(), dto.getCustomerAddress(),dto.getCustomerPhone(),dto.getCustomerNIC(), dto.getCustomerSalary()));
    }

    @Override
    public boolean deleteCustomer(String customerID) throws ClassNotFoundException, SQLException {
        return dao.delete(customerID);
    }

    @Override
    public CustomerDTO searchCustomer(String customerID) throws ClassNotFoundException, SQLException {
        Customer ent = dao.search(customerID);
        return new CustomerDTO(ent.getId(), ent.getName(), ent.getAddress(),ent.getPhone(),ent.getNic(), ent.getSalary());
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() throws ClassNotFoundException, SQLException {
        ArrayList<Customer> all = dao.getAll();
        ArrayList<CustomerDTO> allCustomers = new ArrayList<>();
        for (Customer c : all) {
            allCustomers.add(new CustomerDTO(c.getId(), c.getName(), c.getAddress(),c.getPhone(),c.getNic(), c.getSalary()));
        }
        return allCustomers;
    }

   
}
