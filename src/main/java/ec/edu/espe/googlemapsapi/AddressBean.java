/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.googlemapsapi;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author santiago
 */
@ManagedBean
@RequestScoped
public class AddressBean {

    private String address;

    public AddressBean() {
        address = "";
    }

    public String doSearch() {
        return null;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
