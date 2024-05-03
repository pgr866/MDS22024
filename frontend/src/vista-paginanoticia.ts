import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-paginanoticia')
export class VistaPaginanoticia extends LitElement {
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
<vaadin-vertical-layout style="width: 100%;">
 <vaadin-vertical-layout style="width: 100%; flex-shrink: 0; padding-top: var(--lumo-space-s); padding-right: var(--lumo-space-xl); padding-bottom: var(--lumo-space-s); padding-left: var(--lumo-space-xl); flex-grow: 0;" id="Layoutcontenedornoticiapaginanoticia">
  <label style="width: 80%; flex-shrink: 0; text-align: center; font-size: 200%; align-self: center;" id="Labeltitulonoticiapaginanoticia">Título Noticia</label>
  <label style="width: 80%; flex-shrink: 0; text-align: center; font-size: 100%; align-self: center;" id="Labeltitulotematicapaginanoticia">Temática</label>
  <vaadin-vertical-layout style="width: 100%;">
   <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; flex-direction: column; display: flex; flex-direction: column; justify-content: space-between; flex-grow: 1;" id="Layoutimagennoticiapaginanoticia">
    <img style="flex-shrink: 1; width: 95%; flex-grow: 0; z-index: -1; align-self: center;" src="https://i.postimg.cc/bJs5zvj2/noticia.png" id="Imagennoticiapaginanoticia">
    <vaadin-horizontal-layout style="width: 95%; flex-shrink: 0; justify-content: space-between; flex-grow: 0; align-self: center; height: 6%;">
     <vaadin-horizontal-layout style="flex-shrink: 0; height: 100%; align-self: center; justify-content: space-between; flex-grow: 0; width: 70%;" id="Layoutfechaautorlugarpaginanoticia">
      <label style="flex-shrink: 0; width: 30%; text-align: center;" id="Layoutfechapaginanoticia">Fecha</label>
      <label style="flex-shrink: 0; width: 30%; text-align: center;" id="Layoutautorpaginanoticia">Autor</label>
      <label style="flex-shrink: 0; width: 30%; text-align: center;" id="Layoutlugarpaginanoticia">Lugar</label>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout style="flex-shrink: 0; width: 10%; height: 100%;">
      <vaadin-button style="width: 100%; height: 100%; flex-shrink: 0; flex-grow: 0; align-self: center; background-color: #FFFFFF;">
       <img style="width: 100%; height: 100%;" src="https://i.postimg.cc/nhTZQWjY/papelera.png">
      </vaadin-button>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout style="flex-shrink: 0; width: 20%; height: 100%; justify-content: space-between;" id="Mostrarvaloracionnoticiapaginanoticia"></vaadin-horizontal-layout>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 95%; flex-shrink: 1; padding-top: var(--lumo-space-s); flex-grow: 0; padding-bottom: var(--lumo-space-l); align-self: center;" id="Mostrarnoticiaresumidayextendidapaginanoticia"></vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; flex-shrink: 0; flex-grow: 1;" id="Layoutseccioncomentariospaginanoticia"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
