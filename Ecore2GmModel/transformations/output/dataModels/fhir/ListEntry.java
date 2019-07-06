/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ListEntry of the Data Model fhir.
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
{@link flag}, 
{@link item}, 

* It provides of then following operations (getters and setters)
{@link getFlag},
{@link getItem},
{@link setFlag},
{@link setItem},
 */

@Description("A list is a curated collection of resources.")

public interface ListEntry extends GenericEntity, fhir.BackboneElement {

	EntityType<ListEntry> T = EntityTypes.T(ListEntry.class);

	/* Constants for each property name. */
	java.lang.String flag = "flag";
	java.lang.String item = "item";

	@Description("The flag allows the system constructing the list to indicate the role and significance of the item in the list.")
	@Mandatory
	fhir.CodeableConcept getFlag();
	void setFlag(fhir.CodeableConcept flag);
	@Description("A reference to the actual resource from which data was derived.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getItem();
	void setItem(com.braintribe.model.generic.GenericEntity item);
}
