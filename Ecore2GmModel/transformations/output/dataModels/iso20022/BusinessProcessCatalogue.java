/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type BusinessProcessCatalogue of the Data Model iso20022.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package iso20022;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link repository}, 
{@link topLevelCatalogueEntry}, 

* It provides of then following operations (getters and setters)
{@link getRepository},
{@link getTopLevelCatalogueEntry},
{@link setRepository},
{@link setTopLevelCatalogueEntry},
 */

@Description("Part of the ISO 20022 Repository that contains all Business Process and BusinessTransaction related items.")

public interface BusinessProcessCatalogue extends GenericEntity, iso20022.ModelEntity {

	EntityType<BusinessProcessCatalogue> T = EntityTypes.T(BusinessProcessCatalogue.class);

	/* Constants for each property name. */
	java.lang.String repository = "repository";
	java.lang.String topLevelCatalogueEntry = "topLevelCatalogueEntry";

	@Description("The Repository that owns the BusinessProcessCatalogue.")
	@Mandatory
	iso20022.Repository getRepository();
	void setRepository(iso20022.Repository repository);
	@Description("a TopLevelCatalogueEntry in the BusinessProcessCatalague")
	
	java.util.List<iso20022.TopLevelCatalogueEntry> getTopLevelCatalogueEntry();
	void setTopLevelCatalogueEntry(java.util.List<iso20022.TopLevelCatalogueEntry> topLevelCatalogueEntry);

}
