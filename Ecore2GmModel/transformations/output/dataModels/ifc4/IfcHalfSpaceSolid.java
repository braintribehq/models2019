/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcHalfSpaceSolid of the Data Model iai.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ifc4;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link BaseSurface}, 
{@link AgreementFlag}, 
{@link Dim}, 

* It provides of then following operations (getters and setters)
{@link getBaseSurface},
{@link getAgreementFlag},
{@link getDim},
{@link setBaseSurface},
{@link setAgreementFlag},
{@link setDim},
 */

@Description("")

public interface IfcHalfSpaceSolid extends GenericEntity, ifc4.IfcGeometricRepresentationItem, ifc4.IfcBooleanOperand {

	EntityType<IfcHalfSpaceSolid> T = EntityTypes.T(IfcHalfSpaceSolid.class);

	/* Constants for each property name. */
	java.lang.String BaseSurface = "BaseSurface";
	java.lang.String AgreementFlag = "AgreementFlag";
	java.lang.String Dim = "Dim";

	@Description("")
	@Mandatory
	ifc4.IfcSurface getBaseSurface();
	void setBaseSurface(ifc4.IfcSurface BaseSurface);
	@Description("")
	@Mandatory
	ifc4.Tristate getAgreementFlag();
	void setAgreementFlag(ifc4.Tristate AgreementFlag);
	@Description("")
	@Mandatory
	java.lang.Long getDim();
	void setDim(java.lang.Long Dim);
}
