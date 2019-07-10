/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Connectorend of the Data Model uml.
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
{@link definingEnd}, 
{@link partWithPort}, 
{@link role}, 

* It provides of then following operations (getters and setters)
{@link getDefiningEnd},
{@link getPartWithPort},
{@link getRole},
{@link setDefiningEnd},
{@link setPartWithPort},
{@link setRole},
 */

@Description("A ConnectorEnd is an endpoint of a Connector, which attaches the Connector to a ConnectableElement.<p>From package UML::StructuredClassifiers.</p>")

public interface Connectorend extends GenericEntity, uml.Multiplicityelement {

	EntityType<Connectorend> T = EntityTypes.T(Connectorend.class);

	/* Constants for each property name. */
	java.lang.String definingEnd = "definingEnd";
	java.lang.String partWithPort = "partWithPort";
	java.lang.String role = "role";

	@Description("A derived property referencing the corresponding end on the Association which types the Connector owing this ConnectorEnd, if any. It is derived by selecting the end at the same place in the ordering of Association ends as this ConnectorEnd.<p>From package UML::StructuredClassifiers.</p>")
	@Mandatory
	uml.Property getDefiningEnd();
	void setDefiningEnd(uml.Property definingEnd);
	@Description("Indicates the role of the internal structure of a Classifier with the Port to which the ConnectorEnd is attached.<p>From package UML::StructuredClassifiers.</p>")
	@Mandatory
	uml.Property getPartWithPort();
	void setPartWithPort(uml.Property partWithPort);
	@Description("The ConnectableElement attached at this ConnectorEnd. When an instance of the containing Classifier is created, a link may (depending on the multiplicities) be created to an instance of the Classifier that types this ConnectableElement.<p>From package UML::StructuredClassifiers.</p>")
	@Mandatory
	uml.Connectableelement getRole();
	void setRole(uml.Connectableelement role);
}
