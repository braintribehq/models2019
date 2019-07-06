/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CatalogEntryRelatedEntry of the Data Model fhir.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package fhir;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link item}, 

* It provides of then following operations (getters and setters)
{@link getItem},
{@link setItem},
 */

@Description("Catalog entries are wrappers that contextualize items included in a catalog.")

public interface CatalogEntryRelatedEntry extends GenericEntity, fhir.BackboneElement {

	EntityType<CatalogEntryRelatedEntry> T = EntityTypes.T(CatalogEntryRelatedEntry.class);

	/* Constants for each property name. */
	java.lang.String item = "item";

	@Description("The reference to the related item.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getItem();
	void setItem(com.braintribe.model.generic.GenericEntity item);
}
