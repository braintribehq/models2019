/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type EAnnotation of the Data Model ecore.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ecore;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link source}, 
{@link details}, 
{@link eModelElement}, 
{@link contents}, 
{@link references}, 

* It provides of then following operations (getters and setters)
{@link getSource},
{@link getDetails},
{@link getEModelElement},
{@link getContents},
{@link getReferences},
{@link setSource},
{@link setDetails},
{@link setEModelElement},
{@link setContents},
{@link setReferences},
 */

@Description("")

public interface EAnnotation extends GenericEntity, ecore.EModelElement {

	EntityType<EAnnotation> T = EntityTypes.T(EAnnotation.class);

	/* Constants for each property name. */
	java.lang.String source = "source";
	java.lang.String details = "details";
	java.lang.String eModelElement = "eModelElement";
	java.lang.String contents = "contents";
	java.lang.String references = "references";

	@Description("")
	@Mandatory
	ecore.EString getSource();
	void setSource(ecore.EString source);
	@Description("")
	
	java.util.List<ecore.EStringToStringMapEntry> getDetails();
	void setDetails(java.util.List<ecore.EStringToStringMapEntry> details);

	@Description("")
	@Mandatory
	ecore.EModelElement getEModelElement();
	void setEModelElement(ecore.EModelElement eModelElement);
	@Description("")
	
	java.util.List<ecore.EObject> getContents();
	void setContents(java.util.List<ecore.EObject> contents);

	@Description("")
	
	java.util.List<ecore.EObject> getReferences();
	void setReferences(java.util.List<ecore.EObject> references);

}
