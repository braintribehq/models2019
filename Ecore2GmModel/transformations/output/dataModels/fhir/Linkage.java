/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Linkage of the Data Model fhir.
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
{@link author}, 
{@link item}, 

* It provides of then following operations (getters and setters)
{@link getAuthor},
{@link getItem},
{@link setAuthor},
{@link setItem},
 */

@Description("Identifies two or more records (resource instances) that refer to the same real-world 'occurrence'.If the element is present, it must have either a @value, an @id, or extensions")

public interface Linkage extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Linkage> T = EntityTypes.T(Linkage.class);

	/* Constants for each property name. */
	java.lang.String author = "author";
	java.lang.String item = "item";

	@Description("Identifies the user or organization responsible for asserting the linkages as well as the user or organization who establishes the context in which the nature of each linkage is evaluated.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getAuthor();
	void setAuthor(com.braintribe.model.generic.GenericEntity author);
	@Description("Identifies which record considered as the reference to the same real-world occurrence as well as how the items should be evaluated within the collection of linked items.")
	
	java.util.List<fhir.LinkageItem> getItem();
	void setItem(java.util.List<fhir.LinkageItem> item);

}
