/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Repository of the Data Model iso20022.
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
{@link dataDictionary}, 
{@link businessProcessCatalogue}, 

* It provides of then following operations (getters and setters)
{@link getDataDictionary},
{@link getBusinessProcessCatalogue},
{@link setDataDictionary},
{@link setBusinessProcessCatalogue},
 */

@Description("place where all RepositoryConcepts are stored")

public interface Repository extends GenericEntity, iso20022.ModelEntity {

	EntityType<Repository> T = EntityTypes.T(Repository.class);

	/* Constants for each property name. */
	java.lang.String dataDictionary = "dataDictionary";
	java.lang.String businessProcessCatalogue = "businessProcessCatalogue";

	@Description("the DataDictionary owned by the ISO 20022 Repository")
	@Mandatory
	iso20022.DataDictionary getDataDictionary();
	void setDataDictionary(iso20022.DataDictionary dataDictionary);
	@Description("the BusinessProcessCatalogue owned by the ISO 20022 Repository")
	@Mandatory
	iso20022.BusinessProcessCatalogue getBusinessProcessCatalogue();
	void setBusinessProcessCatalogue(iso20022.BusinessProcessCatalogue businessProcessCatalogue);
}
