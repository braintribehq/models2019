/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Comment of the Data Model uml.
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
{@link annotatedElement}, 
{@link body}, 

* It provides of then following operations (getters and setters)
{@link getAnnotatedElement},
{@link getBody},
{@link setAnnotatedElement},
{@link setBody},
 */

@Description("A Comment is a textual annotation that can be attached to a set of Elements.<p>From package UML::CommonStructure.</p>")

public interface Comment extends GenericEntity, uml.Element {

	EntityType<Comment> T = EntityTypes.T(Comment.class);

	/* Constants for each property name. */
	java.lang.String annotatedElement = "annotatedElement";
	java.lang.String body = "body";

	@Description("References the Element(s) being commented.<p>From package UML::CommonStructure.</p>")
	
	java.util.List<uml.Element> getAnnotatedElement();
	void setAnnotatedElement(java.util.List<uml.Element> annotatedElement);

	@Description("Specifies a string that is the comment.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	types.String getBody();
	void setBody(types.String body);
}
