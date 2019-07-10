/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Objectflow of the Data Model uml.
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
{@link isMulticast}, 
{@link isMultireceive}, 
{@link selection}, 
{@link transformation}, 

* It provides of then following operations (getters and setters)
{@link getIsMulticast},
{@link getIsMultireceive},
{@link getSelection},
{@link getTransformation},
{@link setIsMulticast},
{@link setIsMultireceive},
{@link setSelection},
{@link setTransformation},
 */

@Description("An ObjectFlow is an ActivityEdge that is traversed by object tokens that may hold values. Object flows also support multicast/receive, token selection from object nodes, and transformation of tokens.<p>From package UML::Activities.</p>")

public interface Objectflow extends GenericEntity, uml.Activityedge {

	EntityType<Objectflow> T = EntityTypes.T(Objectflow.class);

	/* Constants for each property name. */
	java.lang.String isMulticast = "isMulticast";
	java.lang.String isMultireceive = "isMultireceive";
	java.lang.String selection = "selection";
	java.lang.String transformation = "transformation";

	@Description("Indicates whether the objects in the ObjectFlow are passed by multicasting.<p>From package UML::Activities.</p>")
	@Mandatory
	types.Boolean getIsMulticast();
	void setIsMulticast(types.Boolean isMulticast);
	@Description("Indicates whether the objects in the ObjectFlow are gathered from respondents to multicasting.<p>From package UML::Activities.</p>")
	@Mandatory
	types.Boolean getIsMultireceive();
	void setIsMultireceive(types.Boolean isMultireceive);
	@Description("A Behavior used to select tokens from a source ObjectNode.<p>From package UML::Activities.</p>")
	@Mandatory
	uml.Behavior getSelection();
	void setSelection(uml.Behavior selection);
	@Description("A Behavior used to change or replace object tokens flowing along the ObjectFlow.<p>From package UML::Activities.</p>")
	@Mandatory
	uml.Behavior getTransformation();
	void setTransformation(uml.Behavior transformation);
}
