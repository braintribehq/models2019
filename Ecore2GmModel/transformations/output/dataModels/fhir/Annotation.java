/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Annotation of the Data Model fhir.
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
{@link authorReference}, 

* It provides of then following operations (getters and setters)
{@link getAuthorReference},
{@link setAuthorReference},
 */

@Description("A  text note which also  contains information about who made the statement and when.If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions")

public interface Annotation extends GenericEntity {

	EntityType<Annotation> T = EntityTypes.T(Annotation.class);

	/* Constants for each property name. */
	java.lang.String authorReference = "authorReference";

	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getAuthorReference();
	void setAuthorReference(com.braintribe.model.generic.GenericEntity authorReference);
}
