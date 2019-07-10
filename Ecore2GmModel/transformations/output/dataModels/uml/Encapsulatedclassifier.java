/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Encapsulatedclassifier of the Data Model uml.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package uml;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link ownedPort}, 

* It provides of then following operations (getters and setters)
{@link getOwnedPort},
{@link setOwnedPort},
 */

@Description("An EncapsulatedClassifier may own Ports to specify typed interaction points.<p>From package UML::StructuredClassifiers.</p>")
 
@Abstract 

public interface Encapsulatedclassifier extends GenericEntity, uml.Structuredclassifier {

	EntityType<Encapsulatedclassifier> T = EntityTypes.T(Encapsulatedclassifier.class);

	/* Constants for each property name. */
	java.lang.String ownedPort = "ownedPort";

	@Description("The Ports owned by the EncapsulatedClassifier.<p>From package UML::StructuredClassifiers.</p>")
	
	java.util.List<uml.Port> getOwnedPort();
	void setOwnedPort(java.util.List<uml.Port> ownedPort);

}
