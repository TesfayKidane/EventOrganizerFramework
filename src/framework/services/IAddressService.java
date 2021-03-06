package framework.services;

import java.util.List;

import framework.domain.Address;

public interface IAddressService {
	public void save(Address address);
	public void update(Address address);
	public List<Address> findAll();
	public Address findOne(Long id);
}
