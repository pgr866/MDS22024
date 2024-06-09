import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-revisarnoticias')
export class VistaRevisarnoticias extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

 render() {
    return html`
<vaadin-vertical-layout style="width: 100%; position: absolute;">
 <vaadin-vertical-layout style="width: 100%; flex-shrink: 0; align-items: center;" theme="spacing-l">
  <vaadin-horizontal-layout style="flex-shrink: 0; width: 80%; height: 12%; justify-content: center; align-items: center;" id="Layouttitulonoticiarevisarnoticias">
   <label style="width: 20%; flex-shrink: 0; flex-grow: 0; font-size: 120%;" id="Labeltitulonoticiarevisarnoticias">Titulo noticia</label>
   <vaadin-text-field style="flex-shrink: 0; flex-grow: 1;" value="Titular" id="Textfieldtitulonoticiarevisarnoticias" tabindex="" has-value readonly></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="flex-shrink: 0; width: 80%; height: 12%; justify-content: center; align-items: center;" id="Layouturlimagenesrevisarnoticias">
   <label style="width: 20%; flex-shrink: 0; flex-grow: 0; font-size: 120%;" id="Labelurlimagenesrevisarnoticias">Url Imagenes</label>
   <vaadin-text-field style="flex-shrink: 0; flex-grow: 1;" value="Url Imagenes" id="Textfieldurlimagenesrevisarnoticias" tabindex="" has-value readonly></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="flex-shrink: 0; width: 80%; height: 30%; justify-content: center; align-items: center;" id="Layoutcontenidonoticiarevisarnoticias">
   <label style="width: 20%; flex-shrink: 0; flex-grow: 0; align-self: flex-start; font-size: 120%;" id="Labelcontenidonoticiarevisarnoticias">Contenido noticia</label>
   <vaadin-text-area style="flex-grow: 1; align-self: stretch; flex-shrink: 0;" value="Contenido noticia" tabindex="" has-value id="Textareacontenidonoticiarevisarnoticias" readonly></vaadin-text-area>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="flex-shrink: 0; width: 80%; justify-content: center; align-items: center; height: 10%;" id="Layoutfechaylugarrevisarnoticias">
   <label style="width: 19.5%; flex-shrink: 0; flex-grow: 0; font-size: 120%;" id="Labelfechaylugarrevisarnoticias">Fecha y lugar</label>
   <vaadin-horizontal-layout style="flex-shrink: 0; justify-content: space-between; flex-grow: 1;" id="Layouttextfieldsfechaylugarrevisarnoticias">
    <vaadin-text-field style="flex-shrink: 0; flex-grow: 0; width: 47%;" value="Fecha" id="Textfieldfecharevisarnoticias" tabindex="" has-value readonly></vaadin-text-field>
    <vaadin-text-field style="flex-shrink: 0; flex-grow: 0; width: 50%;" value="Lugar" id="Textfieldlugarrevisarnoticias" tabindex="" has-value readonly></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="flex-shrink: 0; width: 80%; height: 12%; justify-content: center; align-items: center;" id="Layouttematicarevisarnoticias">
   <label style="width: 20%; flex-shrink: 0; flex-grow: 0; font-size: 120%;" id="Labeltematicarevisarnoticias">Temáticas</label>
   <vaadin-text-field style="flex-shrink: 0; flex-grow: 1;" id="Textfieldtematicarevisarnoticias" value="Temáticas" tabindex="" has-value readonly></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="flex-shrink: 0; width: 80%; height: 12%; justify-content: center; align-items: center;" id="Layoutresumenrevisarnoticias">
   <label style="width: 20%; flex-shrink: 0; flex-grow: 0; font-size: 120%;" id="Labelresumenrevisarnoticias">Resumen</label>
   <vaadin-text-field placeholder="Resumen" style="flex-shrink: 0; flex-grow: 1;" id="Textfieldresumenrevisarnoticias"></vaadin-text-field>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <label id="Labelmensajeerrorrevisarnoticias" style="flex-shrink: 0; font-size: 120%; width: 100%; align-self: center; font-size: 100%; text-align: center; color: #FF0000; padding: var(--lumo-space-s);"></label>
 <vaadin-horizontal-layout style="flex-shrink: 0; width: 60%; justify-content: space-between; align-items: center; align-self: center;">
  <vaadin-horizontal-layout style="flex-shrink: 0; width: 40%; height: 100%;">
   <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; position: relative; padding: 0; height: 100%;" id="Layoutvistaseccionessrevisarnoticias"></vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 55%; justify-content: space-between; padding-top: var(--lumo-space-xl);" id="Layoutopcionesrevisarnoticia">
   <vaadin-button style="width: 48%;" id="publicarrevisarnoticia">
     Publicar Noticia 
   </vaadin-button>
   <vaadin-button style="width: 48%;" id="eliminarrevisarnoticia">
     Eliminar Noticia 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}