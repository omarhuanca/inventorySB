package bo.umss.app.inventorySB.business.product.service.impl;

public class ProductServiceImpl {

	/*
	private Logger log = LogManager.getLogger(getClass());

	@Autowired
	private ProductRepository repository;

	@Override
	public Product create(Product entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product update(Product entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long key) {
		// TODO Auto-generated method stub

	}

	@Override
	public Product read(Long key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findAll() {
		try {
			return repository.findAll();
		} catch (DataAccessException e) {
			log.error(e.getMessage(), e);
			throw new CrudException(CrudException.DATA_ACCESS);
		}
	}

	@Override
	public Product findByCodeProduct(CodeProduct potentialCodeProduct) {
		if (null == potentialCodeProduct) {
			throw new NullFieldException(CodeProduct.CODE_CAN_NOT_BE_NULL);
		}

		try {
			Product entity = repository.findByCodeProduct(potentialCodeProduct);
			if (null != entity) {
				return entity;
			} else {
				throw new EntityNotFoundException();
			}
		} catch (DataAccessException e) {
			log.error(e.getMessage(), e);
			throw new CrudException(CrudException.DATA_ACCESS);
		}
	}

	@Override
	public boolean existsByCodeProduct(CodeProduct potentialCodeProduct) {
		if (null == potentialCodeProduct) {
			throw new NullFieldException(CodeProduct.CODE_CAN_NOT_BE_NULL);
		}

		try {
			return repository.existsByCodeProduct(potentialCodeProduct);
		} catch (DataAccessException e) {
			log.error(e.getMessage(), e);
			throw new CrudException(CrudException.DATA_ACCESS);
		}
	}
	*/
}
