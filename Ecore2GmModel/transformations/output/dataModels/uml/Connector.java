/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Connector of the Data Model uml.
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
{@link contract}, 
{@link end}, 
{@link kind}, 
{@link redefinedConnector}, 
{@link type}, 

* It provides of then following operations (getters and setters)
{@link getContract},
{@link getEnd},
{@link getKind},
{@link getRedefinedConnector},
{@link getType},
{@link setContract},
{@link setEnd},
{@link setKind},
{@link setRedefinedConnector},
{@link setType},
 */

@Description("A Connector specifies links that enables communication between two or more instances. In contrast to Associations, which specify links between any instance of the associated Classifiers, Connectors specify links between instances playing the connected parts only.<p>From package UML::StructuredClassifiers.</p>")

public interface Connector extends GenericEntity, uml.Feature {

	EntityType<Connector> T = EntityTypes.T(Connector.class);

	/* Constants for each property name. */
	java.lang.String contract = "contract";
	java.lang.String end = "end";
	java.lang.String kind = "kind";
	java.lang.String redefinedConnector = "redefinedConnector";
	java.lang.String type = "type";

	@Description("The set of Behaviors that specify the valid interaction patterns across the Connector.<p>From package UML::StructuredClassifiers.</p>")
	
	java.util.List<uml.Behavior> getContract();
	void setContract(java.util.List<uml.Behavior> contract);

	@Description("A Connector has at least two ConnectorEnds, each representing the participation of instances of the Classifiers typing the ConnectableElements attached to the end. The set of ConnectorEnds is ordered.<p>From package UML::StructuredClassifiers.</p>")
	
	java.util.List<uml.Connectorend> getEnd();
	void setEnd(java.util.List<uml.Connectorend> end);

	@Description("Indicates the kind of Connector. This is derived: a Connector with one or more ends connected to a Port which is not on a Part and which is not a behavior port is a delegation; otherwise it is an assembly.<p>From package UML::StructuredClassifiers.</p>")
	@Mandatory
	uml.ConnectorKind getKind();
	void setKind(uml.ConnectorKind kind);
	@Description("A Connector may be redefined when its containing Classifier is specialized. The redefining Connector may have a type that specializes the type of the redefined Connector. The types of the ConnectorEnds of the redefining Connector may specialize the types of the ConnectorEnds of the redefined Connector. The properties of the ConnectorEnds of the redefining Connector may be replaced.<p>From package UML::StructuredClassifiers.</p>")
	
	java.util.List<uml.Connector> getRedefinedConnector();
	void setRedefinedConnector(java.util.List<uml.Connector> redefinedConnector);

	@Description("An optional Association that classifies links corresponding to this Connector.<p>From package UML::StructuredClassifiers.</p>")
	@Mandatory
	uml.Association getType();
	void setType(uml.Association type);
}
