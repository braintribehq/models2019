/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Redefinableelement of the Data Model uml.
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
{@link isLeaf}, 
{@link redefinedElement}, 
{@link redefinitionContext}, 

* It provides of then following operations (getters and setters)
{@link getIsLeaf},
{@link getRedefinedElement},
{@link getRedefinitionContext},
{@link setIsLeaf},
{@link setRedefinedElement},
{@link setRedefinitionContext},
 */

@Description("A RedefinableElement is an element that, when defined in the context of a Classifier, can be redefined more specifically or differently in the context of another Classifier that specializes (directly or indirectly) the context Classifier.<p>From package UML::Classification.</p>")
 
@Abstract 

public interface Redefinableelement extends GenericEntity, uml.Namedelement {

	EntityType<Redefinableelement> T = EntityTypes.T(Redefinableelement.class);

	/* Constants for each property name. */
	java.lang.String isLeaf = "isLeaf";
	java.lang.String redefinedElement = "redefinedElement";
	java.lang.String redefinitionContext = "redefinitionContext";

	@Description("Indicates whether it is possible to further redefine a RedefinableElement. If the value is true, then it is not possible to further redefine the RedefinableElement.<p>From package UML::Classification.</p>")
	@Mandatory
	types.Boolean getIsLeaf();
	void setIsLeaf(types.Boolean isLeaf);
	@Description("The RedefinableElement that is being redefined by this element.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Redefinableelement> getRedefinedElement();
	void setRedefinedElement(java.util.List<uml.Redefinableelement> redefinedElement);

	@Description("The contexts that this element may be redefined from.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Classifier> getRedefinitionContext();
	void setRedefinitionContext(java.util.List<uml.Classifier> redefinitionContext);

}
