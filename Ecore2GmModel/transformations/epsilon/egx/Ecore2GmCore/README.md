# TRANSFORMATIONS

# Additional Technical Information.

The following sections provide a detailed explanation of the Model Driven Engineering (MDE) and design of tools implemented in the context of Smart City Lab (SCL), hereafter SCLTools

Further details are available in READMEs stored in the folders of this git repository.

SCLTools are implemented on top of Eclipse EPSILON (https://www.eclipse.org/epsilon/).

Figure 1 shows a recurrent design pattern for model-driven engineering tasks, a.k.a., Model Transformations.


<img src="https://github.com/braintribehq/com.braintribe.fsl.scl/blob/master/com.braintribe.fsl.scl.tools.epsilon/documents/images/pattern.png" style="width: 800px;"/>
</br>
Figure 1: Generic pattern for model-driven engineering task.
</br>


# Ecore2GmCore: EGX

The Ecore2GmCore transformation is a model-to-text transformation.
 
## Artifact Level:

### INPUT: 
Source Models: [1] <ModelName>.ecore

### Transformation Engine: 
EPSILON

### OUTPUT:
Target Models: [MANY] *.java interfaces representing a <ModelName> Custom Model in TF.

## Language Level:

### INPUT: 
Source Language: [1] Ecore

### Transformation Language: 
EGX/EGL (https://www.eclipse.org/epsilon/doc/)

### OUTPUT:
Target Language: [1] Java


## Useful Links
*EGX Specification*:
https://github.com/braintribehq/com.braintribe.fsl.scl/tree/master/com.braintribe.fsl.scl.tools.epsilon/transformations/epsilon/egx/Ecore2GmCore

*EGL Specification*:
https://github.com/braintribehq/com.braintribe.fsl.scl/tree/master/com.braintribe.fsl.scl.tools.epsilon/transformations/epsilon/egl/JAVA_templates/Ecore2GmCore

## Contact
Contact:

Luca Berardinelli 

luca.berardinelli@braintribe.com

https://www.linkedin.com/in/lucaberardinelli/
