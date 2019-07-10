/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Structuredclassifier of the Data Model uml.
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
{@link ownedAttribute}, 
{@link ownedConnector}, 
{@link part}, 
{@link role}, 

* It provides of then following operations (getters and setters)
{@link getOwnedAttribute},
{@link getOwnedConnector},
{@link getPart},
{@link getRole},
{@link setOwnedAttribute},
{@link setOwnedConnector},
{@link setPart},
{@link setRole},
 */

@Description("StructuredClassifiers may contain an internal structure of connected elements each of which plays a role in the overall Behavior modeled by the StructuredClassifier.<p>From package UML::StructuredClassifiers.</p>")
 
@Abstract 

public interface Structuredclassifier extends GenericEntity, uml.Classifier {

	EntityType<Structuredclassifier> T = EntityTypes.T(Structuredclassifier.class);

	/* Constants for each property name. */
	java.lang.String ownedAttribute = "ownedAttribute";
	java.lang.String ownedConnector = "ownedConnector";
	java.lang.String part = "part";
	java.lang.String role = "role";

	@Description("The Properties owned by the StructuredClassifier.<p>From package UML::StructuredClassifiers.</p>")
	
	java.util.List<uml.Property> getOwnedAttribute();
	void setOwnedAttribute(java.util.List<uml.Property> ownedAttribute);

	@Description("The connectors owned by the StructuredClassifier.<p>From package UML::StructuredClassifiers.</p>")
	
	java.util.List<uml.Connector> getOwnedConnector();
	void setOwnedConnector(java.util.List<uml.Connector> ownedConnector);

	@Description("The Properties specifying instances that the StructuredClassifier owns by composition. This collection is derived, selecting those owned Properties where isComposite is true.<p>From package UML::StructuredClassifiers.</p>")
	
	java.util.List<uml.Property> getPart();
	void setPart(java.util.List<uml.Property> part);

	@Description("The roles that instances may play in this StructuredClassifier.<p>From package UML::StructuredClassifiers.</p>")
	
	java.util.List<uml.Connectableelement> getRole();
	void setRole(java.util.List<uml.Connectableelement> role);

}
