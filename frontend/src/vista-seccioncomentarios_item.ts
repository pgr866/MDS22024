import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-seccioncomentarios_item')
export class VistaSeccioncomentarios_item extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; flex-shrink: 0; justify-content: space-between; height: 100%; flex-direction: row; flex-grow: 1; padding-bottom: var(--lumo-space-l); max-width: 960px; min-width: 822px;">
 <vaadin-vertical-layout style="width: 85%; flex-shrink: 0; height: 100%;">
  <vaadin-horizontal-layout theme="" style="flex-shrink: 0; width: 100%; height: 50%; min-height: 150px;">
   <vaadin-vertical-layout style="height: 100%; flex-shrink: 1; max-width: 130px;" id="Layoutfotousuarioseccioncomentariositem"></vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 70%; flex-shrink: 0; height: 100%; flex-grow: 0; justify-content: center; align-self: center;" id="Layoutnickusuarioseccioncomentariositem">
    <label style="width: 100%; flex-shrink: 0; align-self: flex-start;" id="Labelnickusuarioseccioncomentariositem">Nick</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 6%; flex-shrink: 0; height: 100%; align-self: center;" id="Layoutborrarcomentarioseccioncomentariositem">
    <vaadin-button style="width: 100%; height: 100%; flex-shrink: 0; flex-grow: 0; align-self: center; background-color: #FFFFFF;" id="Buttonborrarcomentario">
     <img style="width: 100%; height: 100%;" src="https://i.postimg.cc/zDRJPp68/papelera.png" id="Imagenborrarcomentarioseccioncomentariositem">
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="" style="flex-shrink: 1; width: 100%; justify-content: space-between; flex-grow: 0;">
   <vaadin-vertical-layout style="flex-shrink: 0; width: 100%; height: 100%;">
    <vaadin-vertical-layout style="flex-shrink: 0; flex-grow: 0; padding-right: var(--lumo-space-s); width: 100%; position: relative;" id="Layoutvistamostrarcomentarioseccioncomentariositem"></vaadin-vertical-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 15%; height: 100%; flex-shrink: 0;">
  <vaadin-vertical-layout style="width: 100%; flex-shrink: 0; height: 100%; position: relative;" id="Layoutvistamostrarvaloracioncomentarioseccioncomentariositem"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
