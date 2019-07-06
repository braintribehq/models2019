/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type TopLevelCatalogueEntry of the Data Model iso20022.
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
{@link businessProcessCatalogue}, 

* It provides of then following operations (getters and setters)
{@link getBusinessProcessCatalogue},
{@link setBusinessProcessCatalogue},
 */

@Description("artefact in the BusinessProcessCatalogue that is not owned by another artefact in the Repository")
 
@Abstract 

public interface TopLevelCatalogueEntry extends GenericEntity, iso20022.RepositoryConcept {

	EntityType<TopLevelCatalogueEntry> T = EntityTypes.T(TopLevelCatalogueEntry.class);

	/* Constants for each property name. */
	java.lang.String businessProcessCatalogue = "businessProcessCatalogue";

	@Description("the BusinessProcessCatalogue that contains all ISO 20022 TopLevelCatalogueEntries")
	@Mandatory
	iso20022.BusinessProcessCatalogue getBusinessProcessCatalogue();
	void setBusinessProcessCatalogue(iso20022.BusinessProcessCatalogue businessProcessCatalogue);
}
