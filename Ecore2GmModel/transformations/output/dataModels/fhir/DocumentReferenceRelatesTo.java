/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type DocumentReferenceRelatesTo of the Data Model fhir.
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
{@link target}, 

* It provides of then following operations (getters and setters)
{@link getTarget},
{@link setTarget},
 */

@Description("A reference to a document of any kind for any purpose. Provides metadata about the document so that the document can be discovered and managed. The scope of a document is any seralized object with a mime-type, so includes formal patient centric documents (CDA), cliical notes, scanned paper, and non-patient specific documents like policy text.")

public interface DocumentReferenceRelatesTo extends GenericEntity, fhir.BackboneElement {

	EntityType<DocumentReferenceRelatesTo> T = EntityTypes.T(DocumentReferenceRelatesTo.class);

	/* Constants for each property name. */
	java.lang.String target = "target";

	@Description("The target document of this relationship.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getTarget();
	void setTarget(com.braintribe.model.generic.GenericEntity target);
}
