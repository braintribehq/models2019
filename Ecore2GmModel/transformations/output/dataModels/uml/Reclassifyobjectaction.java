/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Reclassifyobjectaction of the Data Model uml.
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
{@link isReplaceAll}, 
{@link newClassifier}, 
{@link object}, 
{@link oldClassifier}, 

* It provides of then following operations (getters and setters)
{@link getIsReplaceAll},
{@link getNewClassifier},
{@link getObject},
{@link getOldClassifier},
{@link setIsReplaceAll},
{@link setNewClassifier},
{@link setObject},
{@link setOldClassifier},
 */

@Description("A ReclassifyObjectAction is an Action that changes the Classifiers that classify an object.<p>From package UML::Actions.</p>")

public interface Reclassifyobjectaction extends GenericEntity, uml.Action {

	EntityType<Reclassifyobjectaction> T = EntityTypes.T(Reclassifyobjectaction.class);

	/* Constants for each property name. */
	java.lang.String isReplaceAll = "isReplaceAll";
	java.lang.String newClassifier = "newClassifier";
	java.lang.String object = "object";
	java.lang.String oldClassifier = "oldClassifier";

	@Description("Specifies whether existing Classifiers should be removed before adding the new Classifiers.<p>From package UML::Actions.</p>")
	@Mandatory
	types.Boolean getIsReplaceAll();
	void setIsReplaceAll(types.Boolean isReplaceAll);
	@Description("A set of Classifiers to be added to the Classifiers of the given object.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Classifier> getNewClassifier();
	void setNewClassifier(java.util.List<uml.Classifier> newClassifier);

	@Description("The InputPin that holds the object to be reclassified.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Inputpin getObject();
	void setObject(uml.Inputpin object);
	@Description("A set of Classifiers to be removed from the Classifiers of the given object.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Classifier> getOldClassifier();
	void setOldClassifier(java.util.List<uml.Classifier> oldClassifier);

}
