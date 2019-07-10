/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type EClass of the Data Model ecore.
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
{@link abstract_}, 
{@link interface_}, 
{@link eSuperTypes}, 
{@link eOperations}, 
{@link eAllAttributes}, 
{@link eAllReferences}, 
{@link eReferences}, 
{@link eAttributes}, 
{@link eAllContainments}, 
{@link eAllOperations}, 
{@link eAllStructuralFeatures}, 
{@link eAllSuperTypes}, 
{@link eIDAttribute}, 
{@link eStructuralFeatures}, 
{@link eGenericSuperTypes}, 
{@link eAllGenericSuperTypes}, 

* It provides of then following operations (getters and setters)
{@link getAbstract_},
{@link getInterface_},
{@link getESuperTypes},
{@link getEOperations},
{@link getEAllAttributes},
{@link getEAllReferences},
{@link getEReferences},
{@link getEAttributes},
{@link getEAllContainments},
{@link getEAllOperations},
{@link getEAllStructuralFeatures},
{@link getEAllSuperTypes},
{@link getEIDAttribute},
{@link getEStructuralFeatures},
{@link getEGenericSuperTypes},
{@link getEAllGenericSuperTypes},
{@link setAbstract_},
{@link setInterface_},
{@link setESuperTypes},
{@link setEOperations},
{@link setEAllAttributes},
{@link setEAllReferences},
{@link setEReferences},
{@link setEAttributes},
{@link setEAllContainments},
{@link setEAllOperations},
{@link setEAllStructuralFeatures},
{@link setEAllSuperTypes},
{@link setEIDAttribute},
{@link setEStructuralFeatures},
{@link setEGenericSuperTypes},
{@link setEAllGenericSuperTypes},
 */

@Description("")

public interface EClass extends GenericEntity, ecore.EClassifier {

	EntityType<EClass> T = EntityTypes.T(EClass.class);

	/* Constants for each property name. */
	java.lang.String abstract_ = "abstract_";
	java.lang.String interface_ = "interface_";
	java.lang.String eSuperTypes = "eSuperTypes";
	java.lang.String eOperations = "eOperations";
	java.lang.String eAllAttributes = "eAllAttributes";
	java.lang.String eAllReferences = "eAllReferences";
	java.lang.String eReferences = "eReferences";
	java.lang.String eAttributes = "eAttributes";
	java.lang.String eAllContainments = "eAllContainments";
	java.lang.String eAllOperations = "eAllOperations";
	java.lang.String eAllStructuralFeatures = "eAllStructuralFeatures";
	java.lang.String eAllSuperTypes = "eAllSuperTypes";
	java.lang.String eIDAttribute = "eIDAttribute";
	java.lang.String eStructuralFeatures = "eStructuralFeatures";
	java.lang.String eGenericSuperTypes = "eGenericSuperTypes";
	java.lang.String eAllGenericSuperTypes = "eAllGenericSuperTypes";

	@Description("")
	@Mandatory
	ecore.EBoolean getAbstract_();
	void setAbstract_(ecore.EBoolean abstract_);
	@Description("")
	@Mandatory
	ecore.EBoolean getInterface_();
	void setInterface_(ecore.EBoolean interface_);
	@Description("")
	
	java.util.List<ecore.EClass> getESuperTypes();
	void setESuperTypes(java.util.List<ecore.EClass> eSuperTypes);

	@Description("")
	
	java.util.List<ecore.EOperation> getEOperations();
	void setEOperations(java.util.List<ecore.EOperation> eOperations);

	@Description("")
	
	java.util.List<ecore.EAttribute> getEAllAttributes();
	void setEAllAttributes(java.util.List<ecore.EAttribute> eAllAttributes);

	@Description("")
	
	java.util.List<ecore.EReference> getEAllReferences();
	void setEAllReferences(java.util.List<ecore.EReference> eAllReferences);

	@Description("")
	
	java.util.List<ecore.EReference> getEReferences();
	void setEReferences(java.util.List<ecore.EReference> eReferences);

	@Description("")
	
	java.util.List<ecore.EAttribute> getEAttributes();
	void setEAttributes(java.util.List<ecore.EAttribute> eAttributes);

	@Description("")
	
	java.util.List<ecore.EReference> getEAllContainments();
	void setEAllContainments(java.util.List<ecore.EReference> eAllContainments);

	@Description("")
	
	java.util.List<ecore.EOperation> getEAllOperations();
	void setEAllOperations(java.util.List<ecore.EOperation> eAllOperations);

	@Description("")
	
	java.util.List<ecore.EStructuralFeature> getEAllStructuralFeatures();
	void setEAllStructuralFeatures(java.util.List<ecore.EStructuralFeature> eAllStructuralFeatures);

	@Description("")
	
	java.util.List<ecore.EClass> getEAllSuperTypes();
	void setEAllSuperTypes(java.util.List<ecore.EClass> eAllSuperTypes);

	@Description("")
	@Mandatory
	ecore.EAttribute getEIDAttribute();
	void setEIDAttribute(ecore.EAttribute eIDAttribute);
	@Description("")
	
	java.util.List<ecore.EStructuralFeature> getEStructuralFeatures();
	void setEStructuralFeatures(java.util.List<ecore.EStructuralFeature> eStructuralFeatures);

	@Description("")
	
	java.util.List<ecore.EGenericType> getEGenericSuperTypes();
	void setEGenericSuperTypes(java.util.List<ecore.EGenericType> eGenericSuperTypes);

	@Description("")
	
	java.util.List<ecore.EGenericType> getEAllGenericSuperTypes();
	void setEAllGenericSuperTypes(java.util.List<ecore.EGenericType> eAllGenericSuperTypes);

}
