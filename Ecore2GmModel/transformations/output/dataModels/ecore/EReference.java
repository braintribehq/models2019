/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type EReference of the Data Model ecore.
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
{@link containment}, 
{@link container}, 
{@link resolveProxies}, 
{@link eOpposite}, 
{@link eReferenceType}, 
{@link eKeys}, 

* It provides of then following operations (getters and setters)
{@link getContainment},
{@link getContainer},
{@link getResolveProxies},
{@link getEOpposite},
{@link getEReferenceType},
{@link getEKeys},
{@link setContainment},
{@link setContainer},
{@link setResolveProxies},
{@link setEOpposite},
{@link setEReferenceType},
{@link setEKeys},
 */

@Description("")

public interface EReference extends GenericEntity, ecore.EStructuralFeature {

	EntityType<EReference> T = EntityTypes.T(EReference.class);

	/* Constants for each property name. */
	java.lang.String containment = "containment";
	java.lang.String container = "container";
	java.lang.String resolveProxies = "resolveProxies";
	java.lang.String eOpposite = "eOpposite";
	java.lang.String eReferenceType = "eReferenceType";
	java.lang.String eKeys = "eKeys";

	@Description("")
	@Mandatory
	ecore.EBoolean getContainment();
	void setContainment(ecore.EBoolean containment);
	@Description("")
	@Mandatory
	ecore.EBoolean getContainer();
	void setContainer(ecore.EBoolean container);
	@Description("")
	@Mandatory
	ecore.EBoolean getResolveProxies();
	void setResolveProxies(ecore.EBoolean resolveProxies);
	@Description("")
	@Mandatory
	ecore.EReference getEOpposite();
	void setEOpposite(ecore.EReference eOpposite);
	@Description("")
	@Mandatory
	ecore.EClass getEReferenceType();
	void setEReferenceType(ecore.EClass eReferenceType);
	@Description("")
	
	java.util.List<ecore.EAttribute> getEKeys();
	void setEKeys(java.util.List<ecore.EAttribute> eKeys);

}
