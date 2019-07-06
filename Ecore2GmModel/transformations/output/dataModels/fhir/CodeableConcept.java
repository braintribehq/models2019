/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CodeableConcept of the Data Model fhir.
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
{@link coding}, 

* It provides of then following operations (getters and setters)
{@link getCoding},
{@link setCoding},
 */

@Description("A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions")

public interface CodeableConcept extends GenericEntity {

	EntityType<CodeableConcept> T = EntityTypes.T(CodeableConcept.class);

	/* Constants for each property name. */
	java.lang.String coding = "coding";

	@Description("A reference to a code defined by a terminology system.")
	
	java.util.List<fhir.Coding> getCoding();
	void setCoding(java.util.List<fhir.Coding> coding);

}
